package loon.action.scripting;

import java.util.Stack;

/**
 * Copyright 2008 - 2011
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * @project loonframework
 * @author chenpeng  
 * @email：ceponline@yahoo.com.cn 
 * @version 0.1
 */
public class CallFunction extends Function{
	
    private String script;
    
    public CallFunction(String script) {
        this.script = script;
    }
    
    public void update(ScriptFactory engine, Stack<StackFrame> stack, Callback callback) {
        callback.call(script);
        engine.call(script);
    }

    public String getScript() {
        return script;
    }

}

