# TAGLINE

Produce tones through the PC speaker

# TLDR

Play a **beep**

```beep```

Play a beep that **repeats**

```beep -r [repetitions]```

Play a beep at a specified **frequency** and **duration**

```beep -f [frequency] -l [duration]```

Play **multiple distinct beeps**

```beep -f [frequency] -l [duration] -n -f [frequency] -l [duration]```

Play the **C major scale**

```beep -f 262 -n -f 294 -n -f 330 -n -f 349 -n -f 392 -n -f 440 -n -f 494 -n -f 523```

# SYNOPSIS

**beep** [_options_]

# DESCRIPTION

**beep** uses the PC speaker to produce tones of specified frequency and duration. It can play simple melodies, alert sounds, or serve as an audio notification in scripts.

Multiple tones can be sequenced using the **-n** (new) option to separate distinct beeps. This allows creating simple musical sequences or multi-tone alerts.

# PARAMETERS

**-f** _frequency_
> Frequency in Hertz (default: ~750 Hz, the standard terminal bell frequency)

**-l** _duration_
> Duration in milliseconds (default: 200 ms)

**-r** _count_
> Number of repetitions

**-d** _delay_
> Delay between repetitions in milliseconds

**-n, --new**
> Start a new beep (use for sequences)

**-D** _delay_
> Delay after every repetition including the last, in milliseconds

**-s**
> Read from stdin and beep after each newline

**-c**
> Read from stdin and beep after each character

# CAVEATS

Requires access to the PC speaker device (**/dev/input/by-path/platform-pcspkr-event-spkr** or similar). May require root privileges or appropriate group membership. Not all systems have a functional PC speaker.

# HISTORY

**beep** was created by Johnathan Nightingale and has been a staple of Linux audio notifications since the early 2000s. It provides a lightweight way to produce sounds without requiring audio subsystems.

# SEE ALSO

[speaker-test](/man/speaker-test)(1), [aplay](/man/aplay)(1), [play](/man/play)(1)
