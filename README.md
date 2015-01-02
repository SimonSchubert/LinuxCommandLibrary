##Linux Command Bibliotheca for Android
This library provides a bunch of useful Linux commands.

Download from Play Store https://play.google.com/store/apps/details?id=com.inspiredandroid.linuxcommandbibliotheca

![enter image description here][1]

###Usage
start library

    Intent intent = new Intent("com.inspiredandroid.linuxcommandbibliotheca.CommandBibliothecaActivity");
    startActivityForResult(intent, REQ_PICK_COMMAND);

fetch result

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_PICK_COMMAND) {
	        if (resultCode == Activity.RESULT_OK) {
		        String command = data.getStringExtra(CommandBibliothecaActivity.EXTRA_COMMAND);  
				String base64Icon = data.getStringExtra(CommandBibliothecaActivity.EXTRA_ICON);
            }
        }
    }

###Thanks to
http://www.commandlinefu.com/ for using their API

###License

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


  [1]: https://raw.githubusercontent.com/SimonSchubert/LinuxCommandBibliotheca/master/screen-1.png
