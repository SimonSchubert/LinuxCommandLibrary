# TLDR

**Convert text to speech**

```pico2wave -w [output.wav] "[text to speak]"```

**Specify language**

```pico2wave -l [en-US] -w [output.wav] "[Hello world]"```

**French synthesis**

```pico2wave -l fr-FR -w [output.wav] "[Bonjour le monde]"```

**Pipe to audio player**

```pico2wave -w /dev/stdout "[text]" | aplay```

# SYNOPSIS

**pico2wave** [_options_] **-w** _wavfile_ _text_

# PARAMETERS

**-w**, **--wave** _file_
> Output WAV file (required).

**-l**, **--lang** _lang_
> Language code.

# DESCRIPTION

**pico2wave** is a text-to-speech synthesizer using the SVOX Pico engine. It converts text to a WAV audio file, supporting multiple languages.

Small, efficient TTS suitable for embedded systems.

# LANGUAGES

```
en-US  - English (US)
en-GB  - English (UK)
de-DE  - German
es-ES  - Spanish
fr-FR  - French
it-IT  - Italian
```

# EXAMPLES

```bash
# Basic synthesis
pico2wave -w hello.wav "Hello, how are you?"

# German
pico2wave -l de-DE -w german.wav "Guten Tag"

# Play directly
pico2wave -w /tmp/speech.wav "Hello" && aplay /tmp/speech.wav

# From file
pico2wave -w output.wav "$(cat text.txt)"
```

# CAVEATS

Limited language support. Output is WAV only. Part of libttspico package. Quality varies by language.

# HISTORY

Pico TTS was developed by **SVOX** and released as open source for Android, later packaged for Linux.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [aplay](/man/aplay)(1), [sox](/man/sox)(1)
