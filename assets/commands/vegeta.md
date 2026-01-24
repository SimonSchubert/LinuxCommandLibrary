# TLDR

**Attack endpoint**

```echo "GET http://localhost:8080/" | vegeta attack -rate=[50] | vegeta report```

**Attack with duration**

```echo "GET http://localhost/" | vegeta attack -rate=[100] -duration=[30s] | vegeta report```

**Plot results**

```vegeta attack ... | vegeta plot > [results.html]```

**Encode to JSON**

```vegeta attack ... | vegeta encode --to=json```

**From targets file**

```vegeta attack -targets=[targets.txt] -rate=[10]```

**POST request**

```echo "POST http://localhost/api" | vegeta attack -body=[data.json]```

# SYNOPSIS

**vegeta** _command_ [_options_]

# PARAMETERS

**attack**
> Send requests.

**report**
> Generate report.

**plot**
> HTML plot.

**encode**
> Convert format.

**-rate** _N_
> Requests per second.

**-duration** _D_
> Attack duration.

**-targets** _FILE_
> Targets file.

**-body** _FILE_
> Request body.

**-header** _H_
> HTTP header.

# DESCRIPTION

**vegeta** performs HTTP load testing. It generates constant request rates.

Attack sends requests at specified rate. Results streamed to stdout.

Report analyzes attack results. Latency percentiles, success rates.

Plotting creates visual charts. HTML output with graphs.

Target files define requests. Multiple endpoints tested.

Piping enables workflow chaining. Attack to report to plot.

# CAVEATS

High rates need tuning. System limits may apply. Target server must handle load.

# HISTORY

**Vegeta** was created by **Tomás Senart** for HTTP load testing. Named after the Dragon Ball character, it emphasizes power and speed.

# SEE ALSO

[ab](/man/ab)(1), [wrk](/man/wrk)(1), [hey](/man/hey)(1)
