# TLDR

**Start GNU Typist**

```gtypist```

**Start specific lesson**

```gtypist [lesson.typ]```

**Start at specific lesson number**

```gtypist -l [S1]```

**Use specific interface**

```gtypist -i [curses|ncurses]```

# SYNOPSIS

**gtypist** [_options_] [_script_]

# PARAMETERS

_script_
> Lesson file to use.

**-l** _label_
> Start at specific lesson label.

**-e** _percent_
> Maximum error percentage allowed.

**-s**
> Silent mode (no beeps).

**-w**
> Word processor mode.

**-i** _interface_
> User interface type.

**--help**
> Display help.

# DESCRIPTION

**GNU Typist** is a typing tutor program. It provides lessons for learning touch typing, with exercises progressing from home row keys to full keyboard proficiency.

The program tracks accuracy and speed, requiring users to meet accuracy thresholds before advancing. Custom lesson files can be created.

# INCLUDED LESSONS

- QWERTY keyboard layouts
- Dvorak layout
- Colemak layout
- Number pad training
- Multiple languages

# LESSON FILE FORMAT

```
# Comment
*:LABEL
T:Tutorial text to display
D:Drill text to type
S:Speed test paragraph
```

# CAVEATS

Terminal-based interface. Lessons are English-centric by default. Custom lessons need specific format. Progress not saved between sessions by default.

# HISTORY

GNU Typist was originally written by **Simon Baldwin** and is maintained as part of the GNU project. It follows the tradition of typing tutors dating back to early computer education.

# SEE ALSO

[klavaro](/man/klavaro)(1), [ktouch](/man/ktouch)(1)
