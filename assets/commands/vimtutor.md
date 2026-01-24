# TLDR

**Start vim tutor**

```vimtutor```

**Start in specific language**

```vimtutor [de]```

**Start with different vim**

```VIMRUNTIME=/path vimtutor```

# SYNOPSIS

**vimtutor** [_language_]

# PARAMETERS

_LANGUAGE_
> Two-letter language code (en, de, fr, etc.).

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
