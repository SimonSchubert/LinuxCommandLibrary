# TAGLINE

Terminal-based Wireshark interface

# TLDR

Monitor **default** interface

```sudo termshark```

Monitor **specific** interface

```sudo termshark [interface]```

# SYNOPSIS

**termshark** [_OPTIONS_] [_INTERFACE_|_FILE_]

# PARAMETERS

**-i** _INTERFACE_
> Capture on specified interface

**-r** _FILE_
> Read from pcap file

**-Y** _FILTER_
> Apply display filter

**-f** _FILTER_
> Apply capture filter

# DESCRIPTION

**termshark** is a terminal-based user interface for tshark that provides a Wireshark-like experience in the terminal. It offers packet list, packet details, and packet bytes views with interactive navigation.

The interface supports keyboard navigation, display filtering, and stream reassembly similar to the graphical Wireshark.

# KEYBOARD SHORTCUTS

**Tab** - Switch between views

**/** - Filter packets

**Enter** - Expand/collapse details

**q** - Quit

# CAVEATS

Requires tshark (Wireshark CLI) to be installed. Root privileges needed for live capture. Large capture files may be slow to load.

# HISTORY

**termshark** was created by **Graham Clark** to bring Wireshark's interface paradigm to the terminal, enabling packet analysis over SSH or in environments without a GUI.

# SEE ALSO

[tshark](/man/tshark)(1), [wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(8)
