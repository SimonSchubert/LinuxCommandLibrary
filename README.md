##Linux Command Biblotheca for Android

###Usage
start activity

            Intent intent = new Intent("com.inspiredandroid.linuxcommandbibliotheca.CommandBibliothecaActivity");
        startActivityForResult(intent, REQ_PICK_COMMAND);

fetch result

        @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            switch (requestCode) {
                case REQ_PICK_COMMAND:
                    try {
                        CommandModel commandModel = (CommandModel) data.getSerializableExtra(CommandBibliothecaActivity.EXTRA_COMMAND);
                        String command = commandModel.getCommand();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }

###License

If you use Linux Command Bibliotheca code in your application you should inform the author about it ( email: sschubert89[at]gmail[dot]com ) like this:

> Subject: LCB usage notification Text: I use Linux Command Bibliotheca
> in <application_name> - http://link_to_google_play. I [allow | don't
> allow] to mention my app in section "Applications using Linux Command
> Bibliotheca" on GitHub. 

Also I'll be grateful if you mention Linux Command Bibliotheca in application UI with string "Linux Command Bibliotheca, Simon Schubert" (e.g. in some "About" section).


> Licensed under the Apache License, Version 2.0 (the "License"); you
> may not use this file except in compliance with the License. You may
> obtain a copy of the License at
> 
>    http://www.apache.org/licenses/LICENSE-2.0
> 
> Unless required by applicable law or agreed to in writing, software
> distributed under the License is distributed on an "AS IS" BASIS,
> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
> implied. See the License for the specific language governing
> permissions and limitations under the Licen