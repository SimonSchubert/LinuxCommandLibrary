# TAGLINE

TUI debugger for JSON logs from Beats and Logstash

# TLDR

**Start the server** on the default address (0.0.0.0:8080)

```logshark```

**Listen on the Elasticsearch port** and keep more events

```logshark --host [0.0.0.0] --port [9200] --max [1000]```

Use the **vertical layout** (like Wireshark)

```logshark -layout vertical```

Use a different **theme**

```logshark -theme [lavanda|marrombombom|mono|santa]```

**Send a test event** to a running logshark

```curl -XPOST -d '{"hello":"test"}' http://localhost:8080```

# SYNOPSIS

**logshark** [_options_]

# PARAMETERS

**-host** _HOST_
> Address to listen on. Default: 0.0.0.0.

**-port** _PORT_
> Port to listen on. Default: 8080.

**-max** _N_
> Maximum number of events. Default: 100.

**-layout** _STYLE_
> Layout style: horizontal (default) or vertical.

**-theme** _NAME_
> Color theme: lavanda (default), marrombombom, mono or santa.

**-log** _FILE_
> Debug log file. Default: /dev/null.

# DESCRIPTION

**logshark** is a terminal debugger for JSON logs. It listens on an HTTP port and mimics the Elasticsearch protocol, so Beats (Filebeat, Metricbeat, Heartbeat) and Logstash can send to it through their standard elasticsearch output.

The TUI shows a navigable list of received events with pretty-printed, highlighted JSON, plus statistics such as events per second and average event size in bytes, which help when choosing a bulk or batch size.

# CAVEATS

Events are received over HTTP, not read from stdin or files. Designed specifically for JSON-formatted logs. Options can be written with one or two dashes.

# HISTORY

**logshark** was created by **ugosan** and is written in **Go**.

# SEE ALSO

[jq](/man/jq)(1), [lnav](/man/lnav)(1), [loggo](/man/loggo)(1), [filebeat](/man/filebeat)(1), [logstash](/man/logstash)(1)

# RESOURCES

```[Source code](https://github.com/ugosan/logshark)```

<!-- verified: 2026-11-09 -->
