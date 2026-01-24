# TLDR

**Run speed test**

```speedtest-cli```

**Simple output**

```speedtest-cli --simple```

**List servers**

```speedtest-cli --list```

**Use specific server**

```speedtest-cli --server [12345]```

**JSON output**

```speedtest-cli --json```

**No download test**

```speedtest-cli --no-download```

**No upload test**

```speedtest-cli --no-upload```

**Show bytes**

```speedtest-cli --bytes```

# SYNOPSIS

**speedtest-cli** [_--simple_] [_--server id_] [_--json_] [_options_]

# PARAMETERS

**--simple**
> Simple output.

**--list**
> List servers.

**--server** _ID_
> Specific server.

**--json**
> JSON output.

**--csv**
> CSV output.

**--no-download**
> Skip download test.

**--no-upload**
> Skip upload test.

**--bytes**
> Show bytes/second.

**--share**
> Generate share URL.

**--secure**
> Use HTTPS.

# DESCRIPTION

**speedtest-cli** tests internet speed from command line. It uses Speedtest.net servers.

Simple mode shows key metrics. Ping, download, upload in minimal format.

Server selection targets specific locations. List shows nearby servers.

Share generates result image URL. Easy sharing of results.

Machine-readable output enables automation. JSON and CSV formats.

# CAVEATS

Python-based, needs installation. Server availability varies. Results differ from browser.

# HISTORY

**speedtest-cli** was created by **Matt Martz** as a CLI for Speedtest.net. It enables automated and scripted speed testing.

# SEE ALSO

[iperf](/man/iperf)(1), [fast](/man/fast)(1), [curl](/man/curl)(1)
