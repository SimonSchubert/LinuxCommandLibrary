# TAGLINE

Generate network traffic graph images

# TLDR

Output a **summary** of the last 2 months, days, and all-time

```vnstati --summary --iface [network_interface] --output [path/to/output.png]```

Output the **10 most traffic-intensive days** of all time

```vnstati --top 10 --iface [network_interface] --output [path/to/output.png]```

Output **monthly** traffic statistics from the last 12 months

```vnstati --months --iface [network_interface] --output [path/to/output.png]```

Output **hourly** traffic statistics from the last 24 hours

```vnstati --hours --iface [network_interface] --output [path/to/output.png]```

# SYNOPSIS

**vnstati** [_options_] **-o** _file_ | **--output** _file_

# PARAMETERS

**-i**, **--iface** _interface_
> Select interface to use

**-o**, **--output** _file_
> Output filename (PNG format)

**-s**, **--summary**
> Output traffic summary

**--top** _count_
> Output top days by traffic

**-h**, **--hours**
> Output hourly traffic statistics

**-d**, **--days**
> Output daily traffic statistics

**-m**, **--months**
> Output monthly traffic statistics

**-y**, **--years**
> Output yearly traffic statistics

**-5**, **--fiveminutes**
> Output 5-minute resolution statistics

**--style** _num_
> Modify visual appearance (0-4)

**-c**, **--cache** _time_
> Update output only if database is newer than time

**--headertext** _text_
> Custom header text

**--transparent**
> Toggle background transparency

# DESCRIPTION

**vnstati** generates PNG images from vnStat network traffic data, providing visual representations of bandwidth usage. It reads the same database as vnstat and outputs graphical summaries suitable for web pages or reports.

The tool supports various time ranges (hourly, daily, monthly, yearly) and can generate traffic summaries, top usage days, and 5-minute resolution graphs. Multiple style options allow customization of appearance.

# CAVEATS

Requires vnstat daemon to be running and collecting data. Output is PNG format only. The interface must have existing traffic data in the vnstat database.

# HISTORY

Part of the **vnStat** project by Teemu Toivola. vnstati was added to provide graphical output capabilities, commonly used for generating bandwidth graphs for web-based monitoring dashboards and reports.

# SEE ALSO

[vnstat](/man/vnstat)(1), [nethogs](/man/nethogs)(8), [iftop](/man/iftop)(8)
