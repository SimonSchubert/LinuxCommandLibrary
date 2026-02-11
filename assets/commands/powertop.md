# TAGLINE

Analyze and optimize power consumption

# TLDR

**Calibrate** power measurements

```sudo powertop --calibrate```

Generate **HTML report**

```sudo powertop --html=[report.html]```

**Auto-tune** for optimal power

```sudo powertop --auto-tune```

Measure for specific **duration**

```sudo powertop --time=[60]```

# SYNOPSIS

**powertop** [**--calibrate**] [**--html** _file_] [**--auto-tune**] [**--time** _seconds_]

# PARAMETERS

**--calibrate**
> Calibrate power measurement (cycles display states)

**--html _file_**
> Generate HTML report

**--auto-tune**
> Apply all suggested power optimizations

**--time _seconds_**
> Measurement duration (default: 20)

**--csv _file_**
> Generate CSV report

**--iteration _num_**
> Number of iterations

# DESCRIPTION

**powertop** analyzes system power consumption and suggests optimizations. It identifies power-hungry processes, devices, and kernel settings, providing actionable recommendations.

The interactive mode shows real-time power usage breakdown. Reports can identify specific software or hardware causing excessive power drain on laptops.

# CAVEATS

Calibration requires uninterrupted run and may take several minutes. Auto-tune changes are not persistent across reboots. Some optimizations may affect performance or stability. Root required for most functions.

# HISTORY

**powertop** was developed by **Intel** to help Linux users optimize battery life. It became a standard tool for laptop power management and is included in most distributions.

# SEE ALSO

[powerstat](/man/powerstat)(8), [tlp](/man/tlp)(1), [tuned](/man/tuned)(8)
