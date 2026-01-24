# TLDR

**Speak text**

```echo "[Hello world]" | festival --tts```

**Speak file contents**

```festival --tts [file.txt]```

**Start interactive mode**

```festival```

**Speak with specific voice**

```echo "[text]" | festival --tts --voice [voice_name]```

**Save speech to WAV**

```echo "[Hello]" | text2wave -o [output.wav]```

**List available voices**

```festival -b "(voice.list)"```

# SYNOPSIS

**festival** [_options_] [_file_]

# DESCRIPTION

**festival** is a general-purpose speech synthesis system. It converts text to speech using various synthesis techniques and can be controlled interactively or through scripts.

The system supports multiple languages and voices, and can be extended with new voices. It's used for accessibility, voice interfaces, and audio content generation.

# PARAMETERS

**--tts**
> Text-to-speech mode (read from stdin).

**-b** _expression_
> Evaluate Scheme expression.

**-i**
> Interactive mode.

**--voice** _name_
> Select voice.

**--otype** _type_
> Output type (riff, aiff, etc.).

**--server**
> Run as server.

**--heap** _size_
> Heap size in bytes.

**--help**
> Display help.

# RELATED COMMANDS

**text2wave**: Convert text to audio file
**festival_client**: Connect to server

# CAVEATS

Voice quality varies. Large texts may be slow. Some voices require additional downloads. Scheme knowledge helpful for customization.

# HISTORY

**Festival** was developed at the **Centre for Speech Technology Research** at the **University of Edinburgh** by **Alan Black** and **Paul Taylor** starting in the **1990s**. It became a widely-used open source TTS system.

# SEE ALSO

[espeak](/man/espeak)(1), [pico2wave](/man/pico2wave)(1), [say](/man/say)(1), [flite](/man/flite)(1)
