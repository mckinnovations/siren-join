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
 * Listener interface for the {@link NodePipelineManager}. If the pipeline execution fails, it will call
 * {@link #onFailure(Throwable)}. If the pipeline execution finishes successfully, it will call {@link #onSuccess()}.
 */
public interface NodePipelineListener {

  /**
   * Callback method when the pipeline execution finishes successfully.
   */
  void onSuccess();

  /**
   * Callback method when the pipeline execution fails.
   */
  void onFailure(Throwable e);

}
