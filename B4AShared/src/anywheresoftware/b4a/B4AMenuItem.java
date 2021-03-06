
/*
 * Copyright 2010 - 2020 Anywhere Software (www.b4x.com)
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
 
 package anywheresoftware.b4a;

import android.graphics.drawable.Drawable;

public class B4AMenuItem {
	public final CharSequence title;
	public final Drawable drawable;
	public final String eventName;
	public final boolean addToBar;
	public B4AMenuItem(CharSequence title, Drawable drawable, String eventName, boolean addToBar) {
		this.title = title;
		this.drawable = drawable;
		this.eventName = eventName;
		this.addToBar = addToBar;
	}
}
