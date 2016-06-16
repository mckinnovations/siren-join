/**
 * Copyright (c) 2016, SIREn Solutions. All Rights Reserved.
 *
 * This file is part of the SIREn project.
 *
 * SIREn is a free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * SIREn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package solutions.siren.join.action.coordinate.pipeline;

/**
 * An API for a {@link NodeTask} to communicate its execution status to the {@link NodePipelineManager}.
 */
public class NodeTaskReporter {

  private NodePipelineManager pipeline;

  public NodeTaskReporter(NodePipelineManager pipeline) {
    this.pipeline = pipeline;
  }

  /**
   * Reports to the {@link NodePipelineManager} that the task finished successfully.
   */
  public void success(NodeTaskContext context) {
    pipeline.execute(context, this);
  }

  /**
   * Reports to the {@link NodePipelineManager} that the task failed.
   */
  public void failure(Throwable e) {
    pipeline.getListener().onFailure(e);
  }

  /**
   * Reports to the {@link NodePipelineManager} that it should terminate its execution, even if there are still tasks
   * left in the queue.
   */
  public void terminate() {
    pipeline.terminate();
  }

}
