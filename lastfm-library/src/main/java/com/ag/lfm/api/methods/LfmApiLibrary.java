//Copyright 2016 Arthur Ghazaryan

//        Licensed under the Apache License, Version 2.0 (the "License");
//        you may not use this file except in compliance with the License.
//        You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//        Unless required by applicable law or agreed to in writing, software
//        distributed under the License is distributed on an "AS IS" BASIS,
//        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//        See the License for the specific language governing permissions and
//        limitations under the License.


package com.ag.lfm.api.methods;


import com.ag.lfm.LfmParameters;
import com.ag.lfm.LfmRequest;

@SuppressWarnings("unused")
public class LfmApiLibrary extends ApiBase {


    /**
     * http://www.last.fm/api/show/library.getArtists
     */
    public LfmRequest getArtists(LfmParameters params) {
        return prepareRequest("getArtists", params, false);
    }

    @Override
    protected String getMethodsGroup() {
        return "library";
    }
}
