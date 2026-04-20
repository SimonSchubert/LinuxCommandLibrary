# TAGLINE

Translate text to Morse code

# TLDR

**Translate text to Morse code (dots and dashes)**

```morse -s "[Hello World]"```

**Translate plaintext to audible Morse (speaker)**

```morse -p "[Hello World]"```

**Decode Morse dots/dashes back to text**

```morse -d "[.... . .-.. .-.. ---]"```

**Read text from a file instead of arguments**

```morse -e [file.txt]```

**Adjust words-per-minute when playing audio**

```morse -p -w [20] "[CQ]"```

# SYNOPSIS

**morse** [**-dlps**] [**-e** _file_] [**-w** _wpm_] [**-c** _cpm_] [_string_...]

# PARAMETERS

_string_
> Text to encode (or Morse dots/dashes to decode with **-d**).

**-d**
> Decode Morse (dots and dashes) to text.

**-e** _file_
> Read input from _file_ instead of the command line.

**-l**
> Generate "line-mode" output suitable for LED flashers.

**-p**
> Play Morse audibly via the speaker.

**-s**
> Output short dots/dashes instead of "dit"/"dah".

**-w** _wpm_
> Words-per-minute when playing audio (default 20).

**-c** _cpm_
> Characters-per-minute. Alternative to **-w**.

# DESCRIPTION

**morse** reads input text from arguments or a file and prints the corresponding Morse code. With **-s** the output is the familiar **... --- ...** form; the default form spells out **dit** and **dah**. With **-p** each symbol is played through the system speaker at a configurable speed. With **-d** the tool performs the inverse translation, converting dots and dashes back to text.

Lower-case and upper-case letters are treated the same. Unknown characters are silently skipped.

# CAVEATS

Audible output (**-p**) requires a console or PC speaker; on most modern Linux systems it falls back to nothing unless **pcspkr** is loaded. The **bsdgames** implementation ships different flags on Linux and macOS — consult your local man page if the exact flags differ.

# HISTORY

**morse** is one of the classic **BSD games**, present since early 4BSD distributions as a teaching aid for amateur radio operators.

# SEE ALSO

[beep](/man/beep)(1), [espeak](/man/espeak)(1), [ham](/man/ham)(1)
