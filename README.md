
Certainly, let's refine and detail the description of the Java terminal-based project named "Metro Navigation System":

Project Overview:
The "Metro Navigation System" is a Java terminal-based application structured into four packages: metroSystem, functionality, maps, and utility. Each package serves a specific purpose to enhance the functionality and organization of the system.

Functionality Package:
This package encapsulates the core functionality of the metro navigation system through two key classes: MetroStation and MetroMap.

MetroStation Class: This class holds essential information about a metro station, including its name, connected stations, distances to these stations, and the corresponding metro lines.

MetroMap Class: Responsible for orchestrating the metro system's functionality, this class features methods such as:

createStation: Adds a new station to the metro map.
createPath: Establishes a path between two stations, creating new stations if necessary.
getLineInfo: Retrieves information about metro lines.
pathInfo: Determines junctions and lines in the shortest path, displaying a structured and informative string.
path (with method overriding): Finds the shortest path between two stations.
findShortestDistance: Computes the shortest distance between two stations.
The createPath method, when invoked, creates a path between two stations. If the stations already exist, it simply establishes a path; otherwise, it creates new stations before forming the path. The setPlatform method is utilized to assign platform numbers to stations, with the pathInfo method considering this information.

Maps Package:
The maps package incorporates various classes representing maps of different cities. These classes leverage constructors and a group of createPath methods to define the metro network. After creating paths, the setPlatforms method is called to initialize platform numbers.

Utility Package:
The utility package contains two classes, namely Lodash and DispStat.

Lodash Class: Used for string formatting, it converts strings into camel case, replacing spaces with hyphens. It includes methods toLodash for converting an unformatted string to a lodash string and toNormal for reversing the process.

DispStat Class: This class is responsible for printing all stations in alphabetical order. Stations starting with 'A' are printed on one line, those starting with 'B' on another, and so forth.

MetroSystem Package:
The metroSystem package houses the main class, Initiator. This class performs the following tasks:

Instantiates objects for all metro maps.
Allows the user to select a specific metro map.
Facilitates user selection of source and destination stations.
Prints the most efficient route based on the selected metro map.
