# TAGLINE

Text-to-speech via Speech Dispatcher

# TLDR

**Speak text aloud**

```spd-say "[Hello, world]"```

**Speak with a specific voice type**

```spd-say -t [female1] "[Hello]"```

**Adjust speech rate** (-100 to 100)

```spd-say -r [50] "[Speaking faster]"```

**Adjust pitch** (-100 to 100)

```spd-say -p [-20] "[Lower pitch]"```

**Speak in a specific language**

```spd-say -l [es] "[Hola mundo]"```

**Spell out text**

```spd-say -s "[ABC]"```

**Save speech to WAV file**

```spd-say -o [output.wav] "[Hello]"```

**Read from stdin**

```echo "[Hello world]" | spd-say -e```

**List available voices**

```spd-say --list-voices```

# SYNOPSIS

**spd-say** [_options_] "_text_"

**spd-say** -e

# PARAMETERS

**-r** _RATE_, **--rate** _RATE_
> Speech rate (-100 to 100, default: 0)

**-p** _PITCH_, **--pitch** _PITCH_
> Speech pitch (-100 to 100, default: 0)

**-v** _VOLUME_, **--volume** _VOLUME_
> Speech volume (-100 to 100, default: 0)

**-l** _LANG_, **--language** _LANG_
> Language code (en, es, fr, de, etc.)

**-t** _TYPE_, **--voice-type** _TYPE_
> Voice type (male1, male2, male3, female1, female2, female3, child_male, child_female)

**-o** _MODULE_, **--output-module** _MODULE_
> Output module to use

**-m** _MODE_, **--punctuation-mode** _MODE_
> Punctuation mode (none, some, all)

**-s**, **--spelling**
> Spell the text letter by letter

**-x**, **--ssml**
> Parse input as SSML

**-e**, **--pipe-mode**
> Read text from stdin

**-w**, **--wait**
> Wait until speech is finished

**-S**, **--stop**
> Stop any speech in progress

**-C**, **--cancel**
> Cancel current speech

**-P**, **--priority** _LEVEL_
> Message priority (important, message, text, notification, progress)

**--list-voices**
> List available voices

**--list-output-modules**
> List available output modules

# DESCRIPTION

**spd-say** is a command-line client for Speech Dispatcher that converts text to speech. It sends text to the speech-dispatcher daemon, which routes it to the configured speech synthesizer (typically eSpeak NG, Festival, or similar).

The command provides a simple interface for text-to-speech functionality in scripts and applications. Voice characteristics including rate, pitch, and volume can be adjusted. Multiple languages and voice types are supported depending on installed synthesizers.

Speech Dispatcher acts as a central hub, allowing multiple applications to share speech synthesis resources. The **spd-say** command provides direct access to this system for testing, scripting, and accessibility purposes.

# CAVEATS

Requires the speech-dispatcher daemon to be running. Available voices and languages depend on installed speech synthesizers. Audio output requires a working sound system. The **-o** option for saving to WAV may not work with all output modules. Some synthesizers may not support all voice types.

# HISTORY

Speech Dispatcher was developed as part of the **Free(b)Soft** project to provide a unified text-to-speech interface for Linux accessibility. Development began around **2001**, led by **Hynek Hanke** and **Tomas Cerha**. The project aims to provide speech output for visually impaired users and general text-to-speech functionality. It integrates with screen readers like Orca and provides the **spd-say** command for script and command-line access.

# SEE ALSO

[espeak-ng](/man/espeak-ng)(1), [festival](/man/festival)(1), [speech-dispatcher](/man/speech-dispatcher)(1), [say](/man/say)(1)
