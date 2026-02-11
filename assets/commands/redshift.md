# TAGLINE

Adjust screen color temperature for eye comfort

# TLDR

**Start redshift** with automatic location detection

```redshift```

**Set color temperature manually** (day:night)

```redshift -O [3500]```

**Set day and night temperatures**

```redshift -t [5500]:[3500]```

**Set location manually** (latitude:longitude)

```redshift -l [40.7]:[74.0]```

**Reset screen to normal color** temperature

```redshift -x```

**Run in one-shot mode** (set and exit)

```redshift -o```

**Print current color temperature**

```redshift -p```

# SYNOPSIS

**redshift** [**-l** _lat_:_lon_] [**-t** _day_:_night_] [**-b** _day_:_night_] [**-m** _method_] [_options_]

# PARAMETERS

**-l** _lat_:_lon_
> Set location (latitude:longitude) for sunrise/sunset calculation

**-t** _day_:_night_
> Set color temperature in Kelvin (default: 5500:3500)

**-b** _day_:_night_
> Set screen brightness (0.1-1.0)

**-O** _temp_
> Set specific color temperature immediately

**-o**
> One-shot mode; set temperature and exit

**-x**
> Reset color temperature to default

**-p**
> Print current settings and parameters

**-m** _method_
> Adjustment method (randr, vidmode, drm, wayland)

**-g** _r_:_g_:_b_
> Set gamma correction

**-r**
> Disable temperature transitions

**-v**
> Verbose output

**-c** _file_
> Load configuration from file

# DESCRIPTION

**redshift** adjusts the color temperature of the screen based on time of day, reducing blue light exposure in the evening. This can help reduce eye strain and improve sleep quality by matching screen color to ambient lighting.

During the day, the screen maintains normal color temperature (around 5500-6500K). As the sun sets, redshift gradually transitions to warmer colors (3000-4000K), reducing blue light that can interfere with circadian rhythms.

Location can be determined automatically using geolocation services (geoclue) or specified manually. The program runs continuously, adjusting temperature throughout the day based on calculated sunrise and sunset times.

Different backends support different display systems: **randr** for X11, **wayland** for Wayland compositors, and **drm** for console/framebuffer.

# CONFIGURATION

**~/.config/redshift/redshift.conf**
> User configuration file specifying default location, temperature ranges, brightness, adjustment method, and transition settings.

# CAVEATS

Automatic location detection requires geoclue and appropriate permissions. If detection fails, specify location manually with **-l**.

Some applications (photo/video editing, color-critical work) may require accurate colors. Use **redshift -x** to temporarily disable adjustments or exclude specific times.

Wayland support depends on compositor support. Some Wayland compositors implement their own night light features.

Running multiple instances may cause conflicts. Use a single instance or integrate with your desktop environment's night light settings.

# SEE ALSO

[xrandr](/man/xrandr)(1), [xgamma](/man/xgamma)(1), [gammastep](/man/gammastep)(1)
