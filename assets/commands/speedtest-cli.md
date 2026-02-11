# TAGLINE

Command-line internet speed test client

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

**speedtest-cli** is a Python-based command-line tool for testing internet bandwidth using Speedtest.net infrastructure. It measures download speed, upload speed, and ping latency against Ookla's worldwide server network.

The tool supports multiple output modes including simple (single-line metrics), JSON, and CSV for scripting and monitoring integration. A share option generates a URL to an image of the results on Speedtest.net. Specific test servers can be selected by ID, and individual tests (download or upload) can be skipped to speed up partial measurements.

The tool uses HTTPS connections by default with the **--secure** flag and can show results in bytes per second instead of bits. It is community-maintained and distinct from Ookla's official **speedtest** CLI binary.

# CAVEATS

Python-based, needs installation. Server availability varies. Results differ from browser.

# HISTORY

**speedtest-cli** was created by **Matt Martz** as a CLI for Speedtest.net. It enables automated and scripted speed testing.

# SEE ALSO

[iperf](/man/iperf)(1), [fast](/man/fast)(1), [curl](/man/curl)(1)
