# TLDR

**Start with location**

```wlsunset -l [51.5] -L [-0.1]```

**Manual temperature**

```wlsunset -t [4000] -T [6500]```

**Set gamma**

```wlsunset -g [0.9]```

**Specify output**

```wlsunset -o [DP-1]```

# SYNOPSIS

**wlsunset** [_-l lat_] [_-L lon_] [_-t temp_] [_-T temp_] [_options_]

# PARAMETERS

**-l** _LAT_
> Latitude.

**-L** _LON_
> Longitude.

**-t** _TEMP_
> Night temperature.

**-T** _TEMP_
> Day temperature.

**-g** _GAMMA_
> Gamma value.

**-o** _OUTPUT_
> Specific output.

# DESCRIPTION

**wlsunset** adjusts screen color. It's a Wayland redshift.

Day/night cycle. Automatic adjustment.

Sunrise/sunset calculation. Location-based.

Blue light reduction. Evening warmth.

Wayland native. wlroots compositors.

# CAVEATS

Wayland only. wlroots required. Location needed for auto.

# HISTORY

**wlsunset** was created as a Wayland-native alternative to redshift for adjusting screen color temperature.

# SEE ALSO

[redshift](/man/redshift)(1), [gammastep](/man/gammastep)(1)
