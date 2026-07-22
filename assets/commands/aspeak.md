# TAGLINE

Azure neural text-to-speech from the command line

# TLDR

**Speak** text with a voice

```aspeak -t "[Hello world]" -v [en-US-JennyNeural]```

**Read** a file

```aspeak -f [text.txt] -o [out.mp3]```

**List** voices

```aspeak -l```

# SYNOPSIS

**aspeak** [*options*]

# DESCRIPTION

**aspeak** is a CLI client for Azure Cognitive Services Text-to-Speech (neural voices). Synthesize speech from text or files, select locales/voices, and write audio to files or play it. Install via **pip install aspeak** or Cargo builds documented upstream.

# PARAMETERS

**-t**, **--text** *string*

> Text to synthesize.

**-f**, **--file** *path*

> Input text file.

**-v**, **--voice** *name*

> Voice name.

**-o**, **--output** *file*

> Output audio path.

**-l**, **--list-voices**

> List available voices (requires auth).

Authentication uses Azure speech keys/region via env vars or config—see upstream docs.

# CAVEATS

Requires Azure Speech credentials and network access; usage is billable. Voice availability varies by region.

# INSTALL

```aur: yay -S aspeak```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [say](/man/say)(1)

# RESOURCES

```[Source code](https://github.com/kxxt/aspeak)```

<!-- verified: 2026-07-19 -->
