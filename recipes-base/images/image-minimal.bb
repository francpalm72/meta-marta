DSCRIPTION = "Marta: console-only image with more full-featured Linux system functionality installed."

IMAGE_FEATURES += "ssh-server-openssh"

PREFERRED_VERSION_tar = "1.27.1"
PREFERRED_VERSION_iproute2 = "4.7"

IMAGE_INSTALL = "\
	${CORE_IMAGE_BASE_INSTALL} \
        ${CORE_IMAGE_EXTRA_INSTALL} \
	kernel-devicetree \
	coreutils \
	e2fsprogs \
	logrotate \
	iproute2 \
	iptables \
	minicom \
	wget \
	bzip2 \
	tar \
	sqlite3 \
	ethtool \
    "


inherit core-image
