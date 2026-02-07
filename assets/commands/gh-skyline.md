# TAGLINE

3D visualization of GitHub contribution activity

# TLDR

**View contribution skyline**

```gh skyline```

**View for specific user**

```gh skyline [username]```

**View specific year**

```gh skyline --year [2023]```

# SYNOPSIS

**gh** **skyline** [_username_] [_options_]

# PARAMETERS

**--year** _year_
> Year to display.

# DESCRIPTION

**gh skyline** generates a 3D visualization of GitHub contribution activity rendered in the terminal. It transforms the contribution graph into a skyline where each day's commits appear as buildings of varying heights.

The visualization can be generated for any GitHub user and specific years. Taller structures represent days with more contributions. The terminal rendering uses ASCII art or ANSI graphics to create the 3D effect.

# SEE ALSO

[gh](/man/gh)(1), [gh-status](/man/gh-status)(1)
