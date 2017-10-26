/*
 * Copyright (c) 2017 National Library of Australia
 *
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

package au.gov.nla.httrack2warc.httrack;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class HtsLogParserTest {

    @Test
    public void test() throws IOException {
        try (HtsLogParser htsLog = new HtsLogParser(getClass().getResourceAsStream("test-hts-log.txt"))) {
            assertEquals("3.21-4", htsLog.version);
            assertEquals("http://www.industry.gov.au/acreagereleases/ar_home.html -pandora.nla.gov.au* -www.nla.gov.au/pandora*", htsLog.seedsAndFilters);
            assertEquals("Thu, 03 Apr 2003 01:00:14", htsLog.launchDate);
        }
    }
}