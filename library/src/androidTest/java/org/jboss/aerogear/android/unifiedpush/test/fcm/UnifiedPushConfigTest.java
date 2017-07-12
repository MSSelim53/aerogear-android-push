/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 package org.jboss.aerogear.android.unifiedpush.test.fcm;

import org.jboss.aerogear.android.unifiedpush.fcm.AeroGearFCMPushConfiguration;
import org.jboss.aerogear.android.unifiedpush.fcm.UnifiedPushConfig;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UnifiedPushConfigTest {

    @Test
    public void shouldSetCategories() throws Exception {
        //given
        UnifiedPushConfig config = new UnifiedPushConfig();
        List<String> categories = Arrays.asList("cat1", "cat2");

        //when
        config.setCategories(categories);

        //then
        Assert.assertEquals(categories, config.getCategories());
    }

    @Test
    public void shouldPushConfigSetCategories() throws Exception {
        //given
        AeroGearFCMPushConfiguration config = new AeroGearFCMPushConfiguration();
        List<String> categories = Arrays.asList("cat1", "cat2");

        //when
        config.setCategories(categories);
        // setCategories was doing an add so to test the correct behaviour performing a set twice.
        config.setCategories(categories);

        //then
        Assert.assertEquals(categories, config.getCategories());
    }

}
