/*
 * Copyright (c) Gustavo Claramunt (AnderWeb) 2014.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mightyworkouts.seekbar.internal.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.NonNull;


public class TrackOvalDrawable extends StateDrawable {
    private RectF mRectF = new RectF();

    public TrackOvalDrawable(Context context ,@NonNull ColorStateList tintStateList) {
        super(tintStateList, context);
    }

    @Override
    void doDraw(Canvas canvas, Paint paint) {
        mRectF.set(getBounds());
        canvas.drawOval(mRectF, paint);
    }

}
