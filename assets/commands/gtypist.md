# TAGLINE

Typing tutor program

# TLDR

**Start GNU Typist** with default lessons

```gtypist```

**Start a specific lesson file**

```gtypist [path/to/lesson.typ]```

**Start at a specific lesson label**

```gtypist -l [S1]```

**Set maximum allowed error percentage** (default: 3.0)

```gtypist -e [5.0]```

**Start in silent mode** (no error beeps)

```gtypist -s```

**Track personal best typing speeds**

```gtypist -b```

# SYNOPSIS

**gtypist** [_options_] [_script_]

# PARAMETERS

_script_
> Lesson file to use (.typ format).

**-l** _label_
> Start at a specific lesson label within the script.

**-e** _percent_
> Maximum error percentage allowed (default: 3.0, range: 0.0-100.0).

**-s**
> Silent mode (no beeps on errors).

**-b**, **--personal-best**
> Track personal best typing speeds.

**-n**, **--notimer**
> Turn off the WPM timer in drills.

**-t**, **--term-cursor**
> Use the terminal's hardware cursor.

**-w**
> Word processor mode.

**-V**, **--version**
> Print version and exit.

**--help**
> Display help information.

# DESCRIPTION

**GNU Typist** (gtypist) is a typing tutor program. It provides structured lessons for learning touch typing, with exercises progressing from home row keys to full keyboard proficiency.

The program tracks accuracy and speed, requiring users to meet accuracy thresholds (configurable via **-e**) before advancing to the next exercise. Lesson scripts can be customized or written from scratch using the gtypist lesson file format.

# INCLUDED LESSONS

- QWERTY keyboard layouts (US, UK)
- Dvorak layout
- Colemak layout
- Number pad training
- Multiple languages (German, French, Spanish, etc.)

# LESSON FILE FORMAT

```
# Comment
*:LABEL
T:Tutorial text to display
D:Drill text to type
S:Speed test paragraph
```

# CAVEATS

Terminal-based interface (requires ncurses). Lessons are English-centric by default. Progress is not saved between sessions unless using --personal-best for speed tracking.

# HISTORY

GNU Typist was originally written by **Simon Baldwin** and is maintained as part of the **GNU** project. It follows the tradition of typing tutors dating back to early computer education.
