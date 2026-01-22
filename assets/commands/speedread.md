# TLDR

Read text at **specific speed**

```cat [path/to/file.txt] | speedread -w [250]```

**Resume** from a specific line

```cat [path/to/file.txt] | speedread -resume [5]```

Show **multiple words** at a time

```cat [path/to/file.txt] | speedread -multiword```

# SYNOPSIS

**speedread** [_OPTIONS_]

# PARAMETERS

**-w, -wpm** _words_
> Set reading speed in words per minute (default: 250)

**-resume** _line_
> Resume from specific line number

**-multiword**
> Display multiple words at once

# INTERACTIVE CONTROLS

**[**
> Slow down by 10%

**]**
> Speed up by 10%

**Space**
> Pause and show context lines

**q**
> Quit

# DESCRIPTION

**speedread** is a terminal-based speed reading tool using Rapid Serial Visual Presentation (RSVP). It displays text one word at a time, aligned on the optimal recognition point, enabling faster reading speeds while maintaining comprehension.

The technique reduces eye movement and subvocalization, allowing trained readers to achieve speeds of 400-1000+ words per minute. Text is piped through stdin, making it easy to integrate with other tools like cat, curl, or email clients.

# CAVEATS

Effectiveness varies by individual; speed reading is a skill that requires practice. Very high speeds may reduce comprehension. Complex or technical text may require slower speeds. Terminal must support the display formatting.

# HISTORY

**speedread** was created by **Petr Baudis** (pasky) and released as open-source software. The tool is inspired by **Spritz**, a commercial speed reading technology. RSVP techniques for speed reading have been studied since the **1970s**, with digital implementations becoming popular in the **2010s**.

# SEE ALSO

[less](/man/less)(1), [more](/man/more)(1), [cat](/man/cat)(1)
