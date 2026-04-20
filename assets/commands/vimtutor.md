# TAGLINE

Interactive Vim tutorial

# TLDR

**Start vim tutor**

```vimtutor```

**Start in a specific language**

```vimtutor [de]```

**Start chapter 2** (only available in **en** and **fr**)

```vimtutor -c 2```

**Launch the tutorial in the GUI version** of Vim

```vimtutor -g```

**List all supported languages**

```vimtutor --list```

# SYNOPSIS

**vimtutor** [_-g_] [_-c chapter_] [_language_]

# PARAMETERS

_LANGUAGE_
> ISO-639 language code (e.g. **en**, **de**, **fr**, **ja**).

**-l**, **--language** _CODE_
> Select the tutorial language explicitly. Glued form **-l**_code_ / **--language**_code_ also accepted.

**-c**, **--chapter** _N_
> Load chapter _N_ (1 or 2). Chapter 2 is only shipped in **en** and **fr**.

**-g**, **--gui**
> Start the GUI version of Vim (**gvim**) instead of the terminal binary.

**--list**
> List available language codes and exit.

**-h**, **--help**
> Display help.

# DESCRIPTION

**vimtutor** teaches vim basics through hands-on lessons. It creates a copy of the tutorial file and opens it in vim for practice.

The tutorial covers essential operations in approximately 30 minutes. Each lesson introduces commands with immediate practice exercises.

Topics include navigation, editing, deletion, undo, copy/paste, search, and file operations. These form the foundation for productive vim use.

The working copy ensures mistakes don't affect the original. Users can restart with a fresh copy anytime.

Available languages include English, German, French, Spanish, Chinese, and many others. The tutorial adapts to system locale.

Completing vimtutor provides enough knowledge for basic editing. Advanced features require additional learning.

# LESSONS

**Lesson 1**
> Cursor movement, deletion, insertion, ESC.

**Lesson 2**
> Deletion, operators and motions, undo.

**Lesson 3**
> Put, replace, change operator.

**Lesson 4**
> Location, search, matching, substitute.

**Lesson 5**
> External commands, file operations.

**Lesson 6**
> Open, append, replace, copy, set options.

**Lesson 7**
> Help, vimrc, completion.

# CAVEATS

Only covers basics. Full vim proficiency requires significant practice. Some lessons assume US keyboard layout.

# HISTORY

**vimtutor** has been included with **vim** since early versions, created by **Bram Moolenaar** (vim's author). It's based on the original vi tutorial by Michael C. Pierce and Robert K. Ware.

# SEE ALSO

[vim](/man/vim)(1), [vi](/man/vi)(1), [nvim](/man/nvim)(1), [vimdiff](/man/vimdiff)(1)
