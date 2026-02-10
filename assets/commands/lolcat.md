# TAGLINE

command-line utility that concatenates files or standard input and outputs

# TLDR

**Print text in rainbow colors**

```echo "Hello World" | lolcat```

**Display a file** with rainbow colors

```lolcat [file]```

**Animate the rainbow effect**

```echo "Animated!" | lolcat -a```

**Adjust animation speed** (lower is faster)

```echo "Fast rainbow" | lolcat -a -d [1]```

**Set the rainbow spread** (higher = tighter gradient)

```lolcat -S [3.0] [file]```

**Force color output** even when piping

```lolcat -f [file] | less -R```

# SYNOPSIS

**lolcat** [_options_] [_file ..._]

# PARAMETERS

**-a**, **--animate**
> Animate the rainbow effect

**-d** _duration_, **--duration** _duration_
> Animation duration in seconds per line (default: 12)

**-s** _speed_, **--speed** _speed_
> Animation speed (default: 20.0)

**-S** _spread_, **--spread** _spread_
> Rainbow spread (default: 3.0)

**-F** _freq_, **--freq** _freq_
> Rainbow frequency (default: 0.1)

**-p** _seed_, **--seed** _seed_
> Rainbow seed, 0 = random (default: 0)

**-i**, **--invert**
> Invert foreground and background

**-t**, **--truecolor**
> Use 24-bit truecolor (default on supported terminals)

**-f**, **--force**
> Force color output even when stdout is not a terminal

**-h**, **--help**
> Display help message

**-v**, **--version**
> Print version and exit

# DESCRIPTION

**lolcat** is a command-line utility that concatenates files or standard input and outputs them with a rainbow color gradient. It adds a colorful twist to terminal output, making mundane text visually entertaining.

The program works similarly to **cat** but applies ANSI color codes to create a smooth rainbow gradient across the text. It can process files or receive piped input from other commands, making it easy to add color to any text output.

Commonly paired with ASCII art generators like **figlet** or **cowsay**, lolcat is popular for creating visually striking terminal outputs, system banners, and adding personality to shell scripts.

# CAVEATS

Requires a terminal that supports ANSI color codes. Animation mode can be CPU-intensive on large files. Color output may not display correctly when piped to commands that don't preserve ANSI codes (use **-f** flag and ensure the receiving program supports raw control characters).

# HISTORY

**lolcat** was created by **busyloop** and released as a Ruby gem in **2011**. Inspired by similar colorization tools, it quickly gained popularity in the Unix community for its simple but entertaining approach to terminal output. Multiple implementations now exist in various languages including C, Python, and Rust, with the C version (**c-lolcat**) offering better performance for large files.

# SEE ALSO

[figlet](/man/figlet)(1), [cowsay](/man/cowsay)(1), [toilet](/man/toilet)(1), [cmatrix](/man/cmatrix)(1), [cat](/man/cat)(1)
