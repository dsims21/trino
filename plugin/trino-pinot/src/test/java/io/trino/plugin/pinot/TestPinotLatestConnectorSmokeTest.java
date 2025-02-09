/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.trino.plugin.pinot;

import org.junit.jupiter.api.parallel.Isolated;

import static io.trino.plugin.pinot.TestingPinotCluster.PINOT_LATEST_IMAGE_NAME;

@Isolated
public class TestPinotLatestConnectorSmokeTest
        extends BasePinotConnectorSmokeTest
{
    @Override
    protected boolean isSecured()
    {
        return false;
    }

    @Override
    protected String getPinotImageName()
    {
        return PINOT_LATEST_IMAGE_NAME;
    }
}
