# TAGLINE

Terminal eBook reader with text-to-speech

# TLDR

**Read an eBook**

```lue [path/to/book.epub]```

**Resume reading the last opened book**

```lue```

**Start the navigation guide**

```lue --guide```

**Read with a specific TTS model**

```lue --tts [kokoro] [path/to/book.epub]```

**Read with a specific voice and speed**

```lue --voice [en-US-AriaNeural] --speed [1.5] [path/to/book.epub]```

**Read a PDF with cleaning filter** (removes page numbers, headers)

```lue --filter [path/to/book.pdf]```

# SYNOPSIS

**lue** [_options_] [_file_]

# PARAMETERS

**-k**, **--key** _LAYOUT_
> Specify the keyboard layout to use.

**--guide**
> Launch the interactive navigation guide.

**--tts** _MODEL_
> Use specific TTS model (edge, kokoro, or none).

**--voice** _VOICE_
> Use a specific voice (e.g., "en-US-AriaNeural").

**--speed** _SPEED_
> Set the speech speed (e.g., 1.5).

**--lang** _CODE_
> Specify a language code.

**--over** _SECONDS_
> Seconds of overlap between sentences.

**--filter**
> Enable PDF cleaning filter (removes page numbers, headers, footnotes).

# DESCRIPTION

**lue** is a terminal-based eBook reader with audiobook-quality text-to-speech support. It handles multiple formats including **EPUB**, **PDF**, **DOCX**, **HTML**, **RTF**, **TXT**, and **MD**.

The interface offers three UI complexity modes (Minimal, Medium, and Full) that can be cycled through with the **v** key. Two built-in keyboard layouts are available for navigation.

# CAVEATS

Text-to-speech quality depends on the system's TTS engine. PDF rendering in the terminal may not preserve complex layouts.

# HISTORY

**lue** was created by **superstarryeyes** and is written in **Python**. It can be installed via pip with `pip install lue-reader`.

# SEE ALSO

[bat](/man/bat)(1), [less](/man/less)(1)
