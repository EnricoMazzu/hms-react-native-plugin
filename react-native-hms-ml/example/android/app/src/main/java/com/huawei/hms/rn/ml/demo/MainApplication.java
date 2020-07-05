/*
    Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.huawei.hms.rn.ml.demo;

import android.app.Application;
import android.content.Context;

import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;
import com.huawei.hms.rn.ml.card.HmsCardRecognitionPackage;
import com.huawei.hms.rn.ml.classification.HmsClassificationPackage;
import com.huawei.hms.rn.ml.document.HmsDocumentRecognitionPackage;
import com.huawei.hms.rn.ml.face.HmsFaceRecognitionPackage;
import com.huawei.hms.rn.ml.frame.HmsFramePackage;
import com.huawei.hms.rn.ml.imseg.HmsImageSegmentationPackage;
import com.huawei.hms.rn.ml.landmark.HmsLandMarkRecognitionPackage;
import com.huawei.hms.rn.ml.langdetect.HmsLanguageDetectionPackage;
import com.huawei.hms.rn.ml.object.HmsObjectRecognitionPackage;
import com.huawei.hms.rn.ml.productvision.HmsProductVisionPackage;
import com.huawei.hms.rn.ml.text.HmsTextRecognitionPackage;
import com.huawei.hms.rn.ml.translate.HmsTranslatePackage;
import com.huawei.hms.rn.ml.tts.HmsTextToSpeechPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            List<ReactPackage> packages = new PackageList(this).getPackages();
            // Packages that cannot be autolinked yet can be added manually here, for
            packages.add(new HmsTextRecognitionPackage());
            packages.add(new HmsFramePackage());
            packages.add(new HmsDocumentRecognitionPackage());
            packages.add(new HmsCardRecognitionPackage());
            packages.add(new HmsLandMarkRecognitionPackage());
            packages.add(new HmsTranslatePackage());
            packages.add(new HmsLanguageDetectionPackage());
            packages.add(new HmsProductVisionPackage());
            packages.add(new HmsImageSegmentationPackage());
            packages.add(new HmsClassificationPackage());
            packages.add(new HmsObjectRecognitionPackage());
            packages.add(new HmsTextToSpeechPackage());
            packages.add(new HmsFaceRecognitionPackage());
            return packages;
        }

        @Override
        protected String getJSMainModuleName() {
            return "index";
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, /* native exopackage */ false);
    }

}
