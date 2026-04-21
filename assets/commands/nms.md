# TAGLINE

Recreate the on-screen decryption effect from the movie Sneakers

# TLDR

**Decrypt piped text (press any key to reveal)**

```echo "[text]" | nms```

**Auto-decrypt without waiting for a keypress**

```echo "[text]" | nms -a```

**Set the foreground colour of revealed text**

```echo "[text]" | nms -f green```

**Clear the screen before and restore it after**

```ls -l | nms -c```

**Mask blank spaces as well as visible characters**

```echo "[text]" | nms -s```

**Decrypt the output of a command**

```curl -s wttr.in | nms -a -f cyan```

# SYNOPSIS

**nms** [_-acsv_] [**-f** _color_]

# PARAMETERS

**-a**
> Auto-decrypt: start the reveal immediately without waiting for a keypress.

**-s**
> Mask single blank spaces too (tabs and newlines remain unmasked).

**-f** _COLOR_
> Foreground colour of the revealed text. Accepts `white`, `yellow`, `black`, `magenta`, `blue` (default), `green`, `red`, `cyan`, or an `#RRGGBB` hex value.

**-c**
> Clear the screen before running and restore the terminal state after completion.

**-v**
> Print the version and exit.

# DESCRIPTION

**nms** ("No More Secrets") reads text from standard input, displays it as random noise, and then animates a character-by-character decryption to the original content, recreating the famous data-decryption sequence from the 1992 film *Sneakers*.

Because it reads stdin, **nms** composes naturally with pipes, letting you drop the effect on top of the output of any command. A companion program, **sneakers**, is also shipped by the project and provides the interactive terminal version of the movie scene.

# CAVEATS

Purely a visual effect -- it does not alter the piped data, just the way it is displayed. Requires a terminal that supports ANSI escape sequences and is at least as large as the input text. Very large inputs can take a noticeable amount of time to reveal; use **-a** to skip the keypress pause.

# HISTORY

**No More Secrets** was created by **Brian Barto** and first released on GitHub in **2016**. It became a popular novelty tool in the Linux community and is packaged by most major distributions.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [figlet](/man/figlet)(1), [cowsay](/man/cowsay)(1)

