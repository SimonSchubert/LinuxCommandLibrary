# TLDR

**Start** atop

```atop```

Display **memory** consumption for each process

```atop -m```

Display **disk** information

```atop -d```

Display **background process** information

```atop -c```

Display **thread-specific** resource utilization

```atop -y```

Display the number of **processes for each user**

```atop -au```

# SYNOPSIS

**atop** [_-m_] [_-d_] [_-c_] [_-y_] [_-au_] [_interval_ [_samples_]]

# DESCRIPTION

**atop** is an advanced interactive monitor for Linux systems that shows system-level activity and process-level activity. It highlights resources that have reached critical load and provides historical data logging capabilities.

# PARAMETERS

**-m**
> Display memory consumption for each process

**-d**
> Display disk information

**-c**
> Display command line per process (background processes)

**-y**
> Display thread-specific resource utilization

**-a**
> Display active processes only

**-u**
> Display user statistics

**-g**
> Display generic output (default)

**-1**
> Display averages per second instead of per interval

**-r file**
> Read raw data from file instead of live system

**-w file**
> Write raw data to file for later analysis

# KEYBOARD SHORTCUTS

**g**: generic output
**m**: memory details
**d**: disk details
**n**: network details
**c**: command line per process
**u**: user statistics
**p**: process activity
**?**: help

# CAVEATS

Requires root privileges for some features. Can consume significant resources when monitoring at high frequencies.

# HISTORY

Developed by Gerlof Langeveld. Designed to provide more detailed system monitoring than **top** with historical data logging.

# SEE ALSO

[top](/man/top)(1), [htop](/man/htop)(1), [btop](/man/btop)(1), [glances](/man/glances)(1)
