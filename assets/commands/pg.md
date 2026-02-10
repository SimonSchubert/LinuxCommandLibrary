# TAGLINE

displays text files one page at a time, similar to more and less

# TLDR

**View** a file page by page

```pg [path/to/file]```

Display **help**

```pg -h```

# SYNOPSIS

**pg** [**-**_number_] [**-p** _prompt_] [**-cefnrs**] [_file_...]

# PARAMETERS

**-_number_**
> Number of lines per page

**-c**
> Clear screen before displaying each page

**-e**
> Do not pause at end of file

**-f**
> Do not split long lines

**-n**
> Accept commands without newline

**-p _string_**
> Use string as the prompt

**-r**
> Allow restricted shell escape

**-s**
> Display messages in standout mode

# DESCRIPTION

**pg** displays text files one page at a time, similar to more and less. It allows backward and forward navigation through files and supports searching within the displayed content.

The pager accepts various commands at its prompt: pressing Enter advances one line, space advances one page, and search patterns can be entered with slash notation.

# CAVEATS

Less feature-rich than modern pagers like less. Not installed by default on many systems. Primarily useful for compatibility with older scripts and workflows.

# HISTORY

**pg** is an older Unix pager that predates **more** and **less**. It was originally developed for System V Unix. While largely superseded by more capable pagers, it remains available in util-linux for compatibility.

# SEE ALSO

[less](/man/less)(1), [more](/man/more)(1), [cat](/man/cat)(1)
