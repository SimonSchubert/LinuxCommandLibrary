# TAGLINE

text-to-speech synthesizer using the SVOX Pico engine

# TLDR

**Convert text to a WAV file using default language (en-US)**

```pico2wave -w [output.wav] "[Hello world]"```

**Specify a language for synthesis**

```pico2wave --lang [de-DE] -w [output.wav] "[Hallo Welt]"```

**Synthesize French text**

```pico2wave -l fr-FR -w [output.wav] "[Bonjour le monde]"```

**Synthesize text read from a file**

```pico2wave -w [output.wav] "$(cat [input.txt])"```

**Synthesize and play immediately**

```pico2wave -w /tmp/speech.wav "[text]" && aplay /tmp/speech.wav```

# SYNOPSIS

**pico2wave** [_options_] **-w** _wavfile_ _text_

# PARAMETERS

**-w**, **--wave** _file_
> Output WAV file path (required).

**-l**, **--lang** _lang_
> Language code (default: en-US). See LANGUAGES section for supported values.

# DESCRIPTION

**pico2wave** is a text-to-speech synthesizer using the SVOX Pico engine. It converts text supplied on the command line into a WAV audio file. The output is always 16-bit mono PCM at 16 kHz. Six languages are supported.

# LANGUAGES

```
en-US  - English (US)
en-GB  - English (UK)
de-DE  - German
es-ES  - Spanish
fr-FR  - French
it-IT  - Italian
```

# CAVEATS

Only six languages are supported. Output format is WAV only; use ffmpeg or sox to convert to other formats. Part of the libttspico-utils package. Text must be passed as a command-line argument, not via stdin.

# HISTORY

Pico TTS was developed by **SVOX** and released as open source for Android, later packaged for Linux.

# SEE ALSO

[espeak](/man/espeak)(1), [espeak-ng](/man/espeak-ng)(1), [flite](/man/flite)(1), [festival](/man/festival)(1), [aplay](/man/aplay)(1), [sox](/man/sox)(1)
