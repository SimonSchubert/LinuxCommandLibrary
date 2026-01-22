# TLDR

**Start a typing test** with default 50 words

```tt```

**Start a test with custom word count**

```tt -n [100]```

**Start a timed test** (seconds)

```tt -t [60]```

**Use quote mode** with English quotes

```tt -quotes en```

**Group words** into segments

```tt -n [50] -g [10]```

**Apply a custom theme**

```tt -theme [gruvbox]```

**Use a custom word list**

```tt -words [english1000]```

**Log results to CSV**

```tt -csv >> [~/wpm.csv]```

# SYNOPSIS

**tt** [_options_] [_file_]

# PARAMETERS

**-n** _number_
> Number of words in the test (default: 50)

**-t** _seconds_
> Time limit for the test in seconds

**-g** _number_
> Group words into segments of specified size

**-quotes** _name_
> Enable quote mode with specified quote list

**-words** _name_
> Use custom or built-in word list

**-theme** _name_
> Apply custom or built-in theme

**-csv**
> Output results in CSV format

**-help**
> Display help information

# DESCRIPTION

**tt** is a terminal-based typing test written in Go. It generates tests from randomly selected words and measures typing speed and accuracy. By default, it uses the top 1000 English words.

When given a file path, tt uses that file as input, treating each paragraph as a separate test segment. This allows practicing with custom text or code samples.

After each test, tt displays statistics including characters per minute (CPM), words per minute (WPM), accuracy percentage, and specific mistakes made. Results can be logged to CSV for tracking progress over time.

Custom themes and word lists can be placed in **~/.tt/themes** and **~/.tt/words** directories. The tool is designed to be scriptable and integrate with other Unix tools.

# KEY BINDINGS

**Escape**
> Restart current test

**Ctrl+C**
> Exit

**Right Arrow**
> Next test

**Left Arrow**
> Previous test

# CAVEATS

tt requires a terminal with proper Unicode support for accurate character display. Very narrow terminals may affect word wrapping and display. The default word list focuses on common English words; programmers may want custom lists with symbols.

# HISTORY

**tt** was created by **lemnos** and is hosted on GitHub. Written in **Go**, it was designed as a minimal, scriptable typing test for terminal users who prefer command-line tools over web-based alternatives like monkeytype or typeracer.

# SEE ALSO

[ttyper](/man/ttyper)(1), [gtypist](/man/gtypist)(1), [typespeed](/man/typespeed)(1)
