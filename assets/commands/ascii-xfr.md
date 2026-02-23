# TAGLINE

ASCII file transfer over serial connections

# TLDR

**Send** a file over the serial line

```ascii-xfr -s [path/to/file]```

**Receive** a file from the serial line

```ascii-xfr -r [path/to/file]```

**Send** a file with a **line delay** of 100 milliseconds

```ascii-xfr -s -l 100 [path/to/file]```

**Send** a file with a **character delay** of 10 milliseconds

```ascii-xfr -s -c 10 [path/to/file]```

**Send** a file and transmit an **end-of-file** character when done

```ascii-xfr -s -e [path/to/file]```

**Receive** a file with **verbose** output

```ascii-xfr -r -v [path/to/file]```

# SYNOPSIS

**ascii-xfr** **-s**|**-r** [**-ednv**] [**-l** _linedelay_] [**-c** _characterdelay_] _filename_

# PARAMETERS

**-s**
> Send a file

**-r**
> Receive a file

**-e**
> Send the End-Of-File character (Control-Z) when uploading has finished

**-d**
> Use Control-D instead of Control-Z as the EOF character

**-n**
> Do not translate CR/LF; skip automatic CRLF conversion

**-v**
> Verbose mode; display transfer statistics on stderr

**-l** _milliseconds_
> Line delay; wait this many milliseconds after each line when transmitting

**-c** _milliseconds_
> Character delay; wait this many milliseconds after each character when transmitting

# DESCRIPTION

**ascii-xfr** is a file transfer utility that sends or receives files over serial connections using plain ASCII line-by-line transfer. It is part of the **minicom** package and is designed as a last-resort transfer method when the remote system does not support proper file transfer protocols like ZMODEM, XMODEM, or Kermit.

During sending, end-of-line characters are transmitted as **CRLF**. During receiving, **CR** characters are stripped from incoming data. The tool reads from stdin when receiving and writes to stdout when sending, so it requires I/O redirection to the serial device, typically provided by minicom or a similar terminal emulator.

# CAVEATS

There is no error detection or correction. Data corruption during transfer goes undetected, making it unsuitable for binary files or unreliable links. The tool is designed for text file transfer only; binary files will be corrupted by the CRLF translation unless **-n** is used. The man page itself recommends it should only be used if the remote system does not support anything else.

# HISTORY

**ascii-xfr** was written by **Miquel van Smoorenburg** and **Jukka Lahtinen**, the authors of **minicom**. Minicom originated in the early 1990s as a free, text-based replacement for the DOS program Telix and became the de facto standard serial terminal emulator on Linux. ascii-xfr was created as a companion utility for the simplest possible file transfer scenario.

# SEE ALSO

[minicom](/man/minicom)(1)
