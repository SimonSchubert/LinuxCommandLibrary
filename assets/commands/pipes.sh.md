# TAGLINE

Animated pipes terminal screensaver

# TLDR

**Run pipes animation**

```pipes.sh```

**Set pipe count**

```pipes.sh -p [5]```

**Set frame rate**

```pipes.sh -f [60]```

**Random colors**

```pipes.sh -c [1]```

**Set pipe types**

```pipes.sh -t [0]```

**No bold colors**

```pipes.sh -B```

**Reset screen**

```pipes.sh -r [2000]```

# SYNOPSIS

**pipes.sh** [_-p n_] [_-f fps_] [_-c mode_] [_-t type_] [_options_]

# PARAMETERS

**-p** _N_
> Number of pipes.

**-f** _FPS_
> Target frame rate.

**-c** _MODE_
> Color mode.

**-t** _TYPE_
> Pipe character set.

**-r** _N_
> Reset after N characters.

**-R**
> Random starting point.

**-B**
> No bold.

**-h**
> Show help.

# DESCRIPTION

**pipes.sh** displays animated pipes growing across the terminal as a screensaver-style animation. Pipes start from screen edges, extend in random directions, and turn at random intervals, creating increasingly complex patterns.

Multiple pipes can run simultaneously, each in a different color. Various character sets provide different visual styles, from simple ASCII box-drawing to Unicode block characters. Color modes range from monochrome to full rainbow cycling.

The frame rate flag controls animation smoothness and CPU usage. A periodic reset clears the screen to prevent visual clutter from accumulated pipe trails.

# CAVEATS

CPU usage increases with pipe count. Terminal must support ANSI colors. Best in large terminals.

# HISTORY

**pipes.sh** is a bash implementation of the classic "pipes" screensaver effect. It has become a popular terminal entertainment and desktop decoration script.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [sl](/man/sl)(1), [asciiquarium](/man/asciiquarium)(1)
