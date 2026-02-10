# TAGLINE

converts text to and from Morse code

# TLDR

**Convert text to Morse code**

```morse "[Hello World]"```

**Convert Morse to text**

```morse -d "[.... . .-.. .-.. ---]"```

**Play Morse as sound**

```morse -a "[Hello]"```

**Output with custom speed**

```morse -w [20] "[text]"```

**Input from file**

```morse < [file.txt]```

# SYNOPSIS

**morse** [_options_] [_text_]

# PARAMETERS

_TEXT_
> Text to convert to Morse code.

**-d**
> Decode Morse to text.

**-a**
> Play audio output.

**-w** _WPM_
> Words per minute speed.

**-s**
> Silent mode.

**--help**
> Display help information.

# DESCRIPTION

**morse** converts text to and from Morse code. It can produce audio output.

The tool encodes and decodes Morse. Supports audio playback on capable terminals.

# CAVEATS

Part of bsdgames. Audio requires sound support. ASCII output by default.

# HISTORY

morse originated in **BSD games**, providing educational Morse code conversion since the early BSD distributions.

# SEE ALSO

[beep](/man/beep)(1), [say](/man/say)(1), [espeak](/man/espeak)(1)

