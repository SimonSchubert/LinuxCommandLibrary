# TLDR

Take **screenshot** and save to default location

```gnome-screenshot```

Save to **specific file**

```gnome-screenshot -f path/to/file.png```

Save to **clipboard**

```gnome-screenshot -c```

Take screenshot after **delay**

```gnome-screenshot -d 5```

Capture **current window** only

```gnome-screenshot -w```

Capture **selected area**

```gnome-screenshot -a```

Open **interactive** dialog

```gnome-screenshot -i```

Include **mouse pointer** in screenshot

```gnome-screenshot -p```

# SYNOPSIS

**gnome-screenshot** [**-c**] [**-w**] [**-a**] [**-p**] [**-d** _SECONDS_] [**-i**] [**-f** _FILENAME_]

# DESCRIPTION

**gnome-screenshot** is a GNOME utility that captures the screen, a window, or a user-defined area and saves the resulting image to a file or clipboard.

# PARAMETERS

**-c, --clipboard**
> Send screenshot to clipboard instead of saving to file

**-w, --window**
> Capture the currently active window only

**-a, --area**
> Capture a user-selected screen area

**-p, --include-pointer**
> Include the mouse pointer in the screenshot

**-d, --delay=SECONDS**
> Wait specified seconds before taking screenshot

**-e, --border-effect=EFFECT**
> Apply visual effect (shadow, border, vintage, or none)

**-i, --interactive**
> Launch interactive dialog for screenshot options

**-f, --file=FILENAME**
> Specify the output filename

**--display=DISPLAY**
> Specify the X display to capture

# CAVEATS

Screenshots are saved to ~/Pictures by default. Border effect functionality is deprecated and defaults to "none". Standard GTK+ command-line options are also supported.

# HISTORY

**gnome-screenshot** is part of the GNOME desktop environment, providing a simple screenshot utility for capturing screen content.

# SEE ALSO

[scrot](/man/scrot)(1), [import](/man/import)(1), [xwd](/man/xwd)(1)
