# TLDR

**Speak text**

```mimic -t "[Hello world]"```

**Speak from file**

```mimic -f [input.txt]```

**List available voices**

```mimic -lv```

**Use specific voice**

```mimic -voice [slt] -t "[text]"```

**Save to audio file**

```mimic -t "[text]" -o [output.wav]```

**Adjust speech rate**

```mimic -t "[text]" --setf duration_stretch=[1.5]```

# SYNOPSIS

**mimic** [_options_] -t _text_|-f _file_

# PARAMETERS

**-t** _text_
> Text to speak.

**-f** _file_
> Input text file.

**-o** _file_
> Output audio file.

**-voice** _name_
> Voice to use.

**-lv**
> List voices.

**--setf** _param=val_
> Set float parameter.

**-ssml**
> Input is SSML.

# DESCRIPTION

**Mimic** is Mycroft AI's open-source text-to-speech engine. It's a lightweight, fast TTS system based on Carnegie Mellon's Flite, providing natural-sounding speech synthesis.

Mimic supports multiple voices and can run offline without cloud services.

# VOICE OPTIONS

```
slt   - US English female
awb   - Scottish male
rms   - US English male
kal   - US English male (diphone)
```

# CAVEATS

Limited voice selection compared to cloud TTS. Quality varies by voice. May need compilation for custom voices.

# HISTORY

Mimic was developed by **Mycroft AI** as a fork of CMU Flite, first released in **2016** to provide offline TTS for the Mycroft voice assistant.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [pico2wave](/man/pico2wave)(1), [flite](/man/flite)(1)
