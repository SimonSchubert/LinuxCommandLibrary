# TAGLINE

Generate a 3D model of your GitHub contribution history

# TLDR

**Generate skyline for the current user and year**

```gh skyline```

**Generate skyline for a specific user**

```gh skyline --user [username]```

**Generate skyline for a specific year**

```gh skyline --year [2024]```

**Generate skyline for a range of years**

```gh skyline --year [2020]-[2024]```

**Generate the full contribution history since joining GitHub**

```gh skyline --full```

**Show only the ASCII art preview without generating an STL file**

```gh skyline --art-only```

**Specify a custom output filename**

```gh skyline --output [my-skyline.stl]```

**Open the GitHub profile in a web browser**

```gh skyline --web```

# SYNOPSIS

**gh** **skyline** [_options_]

# PARAMETERS

**-u**, **--user** _username_
> GitHub username to generate the skyline for. Defaults to the authenticated user.

**-y**, **--year** _year_
> Year or range of years (e.g. 2024 or 2020-2024). Must be between 2008 and the current year.

**-f**, **--full**
> Generate the contribution graph from the user's join year to the current year.

**-a**, **--art-only**
> Show the ASCII art preview without generating an STL file.

**-o**, **--output** _filename_
> Output filename. Default is {username}-{year}-github-skyline.stl.

**-w**, **--web**
> Open the GitHub profile in a web browser.

**-d**, **--debug**
> Enable debug logging.

# DESCRIPTION

**gh skyline** is a GitHub CLI extension that generates a 3D STL model of a user's GitHub contribution history. It transforms the contribution graph into a skyline where each day's contributions appear as buildings of varying heights. The output is a 3D-printable STL file.

An ASCII art preview of the skyline is displayed in the terminal. The model can be generated for any GitHub user, for specific years, or for the full contribution history since the user joined GitHub.

# SEE ALSO

[gh](/man/gh)(1), [gh-extension](/man/gh-extension)(1)
