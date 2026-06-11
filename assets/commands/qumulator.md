# TAGLINE

Cloud quantum-circuit simulator client

# TLDR

**Run a 1000-qubit GHZ** demonstration against the public API

```qumulator demo```

**Run the** Willow-layout benchmark

```qumulator demo --willow```

**Run the holographic** wormhole demonstration

```qumulator demo --wormhole```

**Run the anyon braiding** demonstration

```qumulator demo --anyon```

**Show instructions** for obtaining a free API key

```qumulator key```

**Submit a QASM circuit** and print the result

```qumulator run [circuit.qasm]```

**Pass an API key** explicitly

```qumulator run [circuit.qasm] --key [YOUR_KEY]```

# SYNOPSIS

**qumulator** _command_ [_options_]

# DESCRIPTION

**qumulator** is the command-line client for the **Qumulator** cloud API, which simulates quantum circuits, spin systems, photonic amplitudes, and molecular properties on standard classical hardware. The local CLI submits jobs via HTTP and prints the result; the heavy compute runs in the cloud (Google Cloud Run, 4 vCPU, 16 GB RAM by default).

The simulator targets up to about **1000 qubits** for structured circuits without requiring a GPU or quantum hardware. The CLI is bundled with the **qumulator-sdk** Python package, so installing the SDK exposes both the Python client and the **qumulator** binary.

# COMMANDS

**demo** [**--willow** | **--wormhole** | **--anyon**]
> Run a built-in demonstration. Without flags, runs a 1000-qubit GHZ circuit. **--willow** runs a 105-qubit Willow-layout benchmark, **--wormhole** runs a holographic wormhole simulation, **--anyon** runs an anyon-braiding computation.

**key**
> Print instructions for obtaining a free API key.

**run** _circuit.qasm_
> Submit a **QASM** file to the API and print the result.

# OPTIONS

**--key** _KEY_
> Pass the API key directly instead of relying on the environment.

# CONFIGURATION

**QUMULATOR_API_KEY**
> Environment variable used by all subcommands when **--key** is not supplied. Obtain a key with **qumulator key**.

# CAVEATS

Because circuits are executed in the cloud, **circuit data leaves the local machine** — do not submit circuits whose structure you consider confidential. Network latency dominates short jobs, so iterating on tiny circuits will be much slower than running them in a local simulator.

# HISTORY

**Qumulator** is published as the **qumulator-sdk** Python package. It positions itself as a way to run very large but structured quantum simulations on commodity classical hardware via a hosted API, lowering the cost of experimenting with quantum algorithms compared with paid quantum hardware time.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1)
