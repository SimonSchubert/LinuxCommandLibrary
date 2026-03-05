# TAGLINE

Terminal visualization for real-time hardware sensor data from HWInfo

# TLDR

**Monitor sensors interactively** from a CSV file

```hwinfo-tui monitor [sensors.csv] "[sensor_name]"```

**Monitor multiple sensors**

```hwinfo-tui monitor [sensors.csv] "[CPU Temperature]" "[GPU Temperature]"```

**Set custom refresh rate**

```hwinfo-tui monitor --refresh [0.5] [sensors.csv] "[sensor_name]"```

**Set history window** duration

```hwinfo-tui monitor --history [600] [sensors.csv] "[sensor_name]"```

# SYNOPSIS

**hwinfo-tui** **monitor** [**--refresh** _seconds_] [**--history** _seconds_] _csv_file_ _sensor_names_...

# DESCRIPTION

**hwinfo-tui** is a terminal visualization tool for monitoring real-time hardware sensor data from **HWInfo64**. Inspired by **gping**, it provides a clean TUI with interactive charts and statistics tables showing min, max, average, and 95th percentile values for each monitored sensor.

The tool features fuzzy sensor name matching with suggestions, configurable refresh rates (0.1-60 seconds), and adjustable history windows (10-7200 seconds). It reads sensor data from CSV files exported by HWInfo64.

# CAVEATS

**HWInfo64** is only available on Windows; on other platforms you can use the tool with pre-exported CSV files. Requires Python 3. Memory usage scales with history window size and number of monitored sensors.

# HISTORY

**hwinfo-tui** was created by **Juanjo Fuchs** and is written in **Python**. It was inspired by the visual style of gping and designed to bring hardware monitoring to the terminal.

# SEE ALSO

[sensors](/man/sensors)(1), [htop](/man/htop)(1)
