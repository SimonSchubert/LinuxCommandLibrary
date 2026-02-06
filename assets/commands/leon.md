# TLDR

**Install the Leon CLI globally**

```npm install --global @leon-ai/cli```

**Create a new Leon instance**

```leon create birth```

**Start Leon**

```leon start```

**Check Leon status**

```leon status```

**Display installed skills**

```leon skills```

**Stop a running Leon instance**

```leon stop```

# SYNOPSIS

**leon** _command_ [_options_]

# PARAMETERS

**create birth**
> Initialize and set up a new Leon instance with all required dependencies.

**start**
> Start the Leon server and enable interaction.

**stop**
> Stop a running Leon instance.

**status**
> Display current status of the Leon instance.

**skills**
> List all installed skills and their status.

**check**
> Verify that system requirements are met.

**update**
> Update Leon to the latest version.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**Leon** is an open-source personal AI assistant that runs on your own server. It provides a skills-based architecture where each capability is a modular skill that can be installed, configured, and extended independently.

Leon supports voice interaction for hands-free operation and text-based input through its web interface. It runs on Node.js with a Python runtime for skill execution, making it cross-platform across Linux, macOS, and Windows.

The assistant is designed for self-hosting, keeping all data and processing on your own infrastructure. Skills cover categories such as productivity, utilities, and information retrieval. Developers can create custom skills to extend Leon's capabilities.

# CAVEATS

Requires Node.js and Python installed on the host system. Voice interaction depends on a microphone and supported speech recognition setup. Some skills may require additional API keys for external service integrations. The initial setup downloads several dependencies and may take time on slower connections.

# HISTORY

Leon was created by **Louis Grenard** and first released in **2019**. The project is hosted at **getleon.ai** and has accumulated over 15,000 GitHub stars. It was designed as a privacy-focused alternative to cloud-based assistants like Alexa and Google Assistant, emphasizing self-hosting and open-source extensibility. Development continues with an active community contributing skills and improvements.

# SEE ALSO

[openclaw](/man/openclaw)(1), [nanobot](/man/nanobot)(1), [nanoclaw](/man/nanoclaw)(1), [claude](/man/claude)(1)
