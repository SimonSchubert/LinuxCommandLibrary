# TAGLINE

Social engineering penetration testing framework

# TLDR

**Launch the Social Engineering Toolkit**

```sudo setoolkit```

# SYNOPSIS

**setoolkit**

**sudo setoolkit**

# MAIN MENU OPTIONS

**1) Social-Engineering Attacks**
> Spear phishing, website attacks, credential harvesting, infectious media

**2) Penetration Testing (Fast-Track)**
> Rapid exploit deployment tools

**3) Third Party Modules**
> Additional community modules

**4) Update the Social-Engineer Toolkit**
> Update to latest version

**5) Update SET configuration**
> Modify configuration settings

**6) Help, Credits, and About**
> Documentation and credits

**99) Exit the Social-Engineer Toolkit**
> Quit the application

# SOCIAL ENGINEERING ATTACKS

**1) Spear-Phishing Attack Vectors**
> Email-based attacks with malicious attachments

**2) Website Attack Vectors**
> Clone websites for credential harvesting

**3) Infectious Media Generator**
> Create malicious USB/CD payloads

**4) Create a Payload and Listener**
> Generate Metasploit payloads

**5) Mass Mailer Attack**
> Send phishing emails to multiple targets

**6) Arduino-Based Attack Vector**
> USB HID attacks using Arduino

**7) Wireless Access Point Attack Vector**
> Rogue AP attacks

**8) QRCode Generator Attack Vector**
> Malicious QR codes

**9) Powershell Attack Vectors**
> Windows PowerShell-based attacks

**10) SMS Spoofing Attack Vector**
> Spoofed SMS messages

# CONFIGURATION

**/etc/setoolkit/set.config**
> Main configuration file controlling Apache server toggle, web interface port, email settings, and Metasploit integration paths.

# DESCRIPTION

**setoolkit** (Social-Engineer Toolkit) is a Python-based penetration testing framework focused on social engineering attacks. It provides automated attack vectors for phishing, credential harvesting, and payload delivery through a menu-driven interface.

The toolkit integrates with Metasploit for payload generation and exploitation. Common use cases include cloning websites to harvest credentials, generating malicious files for spear-phishing campaigns, and creating infected USB drives for physical access attacks.

SET is designed for authorized penetration testing and security awareness training. It demonstrates how attackers exploit human psychology rather than technical vulnerabilities, helping organizations understand and defend against social engineering threats.

# CAVEATS

Requires root privileges to run. Many attacks require additional configuration (email servers, domain names, SSL certificates). The toolkit must only be used with explicit authorization—unauthorized use is illegal. Some antivirus software may flag generated payloads. The deprecated **se-toolkit** command has been replaced by **setoolkit**.

# HISTORY

The Social-Engineer Toolkit was created by **David Kennedy** (ReL1K) at **TrustedSec** and first released in **2009**. It was designed to provide a comprehensive platform for testing organizations' susceptibility to social engineering attacks. SET became one of the most widely used tools in penetration testing, particularly for simulating phishing campaigns and security awareness assessments. The project remains actively maintained on GitHub.

# SEE ALSO

[msfconsole](/man/msfconsole)(1), [beef-xss](/man/beef-xss)(1), [gophish](/man/gophish)(1)
