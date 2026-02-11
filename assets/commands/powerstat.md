# TAGLINE

Measure system power consumption statistics

# TLDR

Measure power with **defaults**

```powerstat```

Measure with custom **interval and samples**

```powerstat [10] [20]```

Use **RAPL** interface

```powerstat -R [10] [20]```

Show **histogram**

```powerstat -H [10] [20]```

Enable **all** statistics

```powerstat -a [10] [20]```

# SYNOPSIS

**powerstat** [**-a**] [**-H**] [**-R**] [_interval_] [_samples_]

# PARAMETERS

**interval**
> Seconds between measurements (default: 10)

**samples**
> Number of measurements (default: 10)

**-a**
> Enable all statistics gathering

**-H**
> Show histogram of measurements

**-R**
> Use Intel RAPL interface instead of battery

**-d**
> Show distribution statistics

**-z**
> Show zero/idle power estimate

# DESCRIPTION

**powerstat** measures system power consumption using battery discharge rate or Intel's RAPL (Running Average Power Limit) interface. It provides statistical analysis of power usage over time.

The tool is useful for evaluating power efficiency of applications, kernel settings, or hardware configurations on laptops and servers.

# CAVEATS

Battery mode requires battery-powered system. RAPL requires Intel CPU with RAPL support. Measurements may vary based on system load. Run multiple samples for accuracy.

# HISTORY

**powerstat** was written by **Colin Ian King** as part of his power management testing tools. It's commonly used in Ubuntu's power testing and optimization efforts.

# SEE ALSO

[powertop](/man/powertop)(8), [turbostat](/man/turbostat)(8), [cpupower](/man/cpupower)(1)
