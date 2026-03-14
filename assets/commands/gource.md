# TAGLINE

Animated version control history visualization

# TLDR

**Visualize current repo**

```gource```

**Visualize specific repo**

```gource [/path/to/repo]```

**Run in fullscreen mode**

```gource -f```

**Output PPM stream and pipe to ffmpeg for video**

```gource -1280x720 -o - | ffmpeg -y -r 60 -f image2pipe -vcodec ppm -i - -vcodec libx264 -pix_fmt yuv420p [output.mp4]```

**Set time scale**

```gource --seconds-per-day [0.1]```

**Hide specific elements**

```gource --hide filenames,mouse,progress```

**Visualize with a date range**

```gource --start-date "[2024-01-01]" --stop-date "[2024-12-31]"```

# SYNOPSIS

**gource** [_options_] [_path_]

# PARAMETERS

_PATH_
> Repository path (defaults to current directory).

**-o**, **--output-ppm-stream** _FILE_
> Output PPM image stream to file ('-' for stdout). Used with ffmpeg for video creation.

**-r**, **--output-framerate** _FPS_
> Framerate of output (25, 30, 60). Used with --output-ppm-stream.

**-WIDTHxHEIGHT**, **--viewport** _WIDTHxHEIGHT_
> Set viewport size (e.g., 1280x720).

**--seconds-per-day** _SEC_
> Time in seconds for each day of history (default: 10).

**--hide** _ELEMENTS_
> Hide display elements (comma-separated): bloom, date, dirnames, files, filenames, mouse, progress, root, tree, users, usernames.

**--start-date** _DATE_
> Start at a date (YYYY-MM-DD format).

**--stop-date** _DATE_
> Stop at a date.

**-f**, **--fullscreen**
> Fullscreen mode.

**--title** _TITLE_
> Set a title.

**--load-config** _FILE_
> Load a configuration file.

**--save-config** _FILE_
> Save current options to a configuration file.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**gource** visualizes version control history as an animated tree. Developers appear as avatars making changes, with files and directories branching from the center in a real-time animation.

The tool supports Git, SVN, Mercurial, and Bazaar repositories. Output can be piped to video encoders like ffmpeg for creating shareable recordings of project history.

# CAVEATS

Requires OpenGL. Large repositories with many files or commits may be slow to render. The output stream uses uncompressed PPM format, so piped video files can be very large before encoding. Use --seconds-per-day and --hide to optimize for large repos.

# HISTORY

gource was created by **Andrew Caudwell** to visualize software development history as engaging animations.

# SEE ALSO

[git-log](/man/git-log)(1), [ffmpeg](/man/ffmpeg)(1)
