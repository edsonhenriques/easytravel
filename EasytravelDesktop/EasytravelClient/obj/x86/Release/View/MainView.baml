   M S B A M L   `   `   `  ���� K  GEasytravelClient, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullQ-clr-namespace:Armandorv.EasytravelClient.ViewArmandorv.EasytravelClient.View  .    (Armandorv.EasytravelClient.View.MainView   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     @d2http://schemas.microsoft.com/expression/blend/2008     Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     D
easytravel-clr-namespace:Armandorv.EasytravelClient.View       � Title$  Easytravel Client��$	��485��$	��758�� � WindowStyle$ 
ToolWindow=� � 
ResizeMode$ CanMinimize=� � WindowStartupLocation$ CenterScreen=�.��]� -   $��
dockPanel1��$	��484��$	��743��.+�� $	��Top=�.+��� -   $��label6��$��
Easytravel��$
��Bold"�$��24(�$��Normal$�$��Maiandra GD)�$��9,14,0,0q�� -   $��OptionsGrid��$	��354��$	��199��.+��� -   $��personalInformationLabel��$��Options��$��28��$
��Left=�$��6,16,0,0q�$	��Top=�$	��177��$
��Bold"�$��Normal$�$��Maiandra GD)�$��14(��� -   $��optionsList��$	��226��$
��Left=�$��6,60,0,0q�$	��Top=�$	��187��.@��� $��30��|�.  $��10q�.����  �� Command �� *ShowHomeCommand+.�.��� $
��Home��$��1q��� -   $��30��|�.  $��10q�.����  �� *ShowTravelsBrowserCommand+.�.��� $��Travels browser���� $��30��|�.  $��10q�.����  �� *ShowHasVisitedCommand+.�.��� $��Has visitied��$��1q��� $��30��$��10q�|�.  .����  �� *ShowMostVisitedCommand+.�.��� $��Most visited destinations��$��1q�|�. �� -   $��selectedOptionTabControl��$	��365��$	��495��.@��� -   $��homeTabItem��$�� ��$��0��$��0��.��� -	   $��homeGrid��$	��347��$	��487��{�.  J� OpacityMask Z� .+��� -
   $��	homeLabel��$#��Welcome to Easytravel desktop��$��28��$
��Left=�$��6,16,0,0q�$	��Top=�$	��462��$
��Bold"�$��Normal$�$��Maiandra GD)�$��14(��� -   $��image2��$	��187��$
��Left=�$��0,93,0,0q�$
��Fill=�$	��Top=�$	��488��$6��0/EasytravelClient;component/Images/headerimg.jpg���� -   $��travelsBrowserTabItem��$�� ��$��0��$��0��.��� -   $��travelsBrowserGrid��$	��347��$	��487��{�.  Z� .+��� -   $��travelsBrowserLabel��$��Travels Browser��$��28��$
��Left=�$��6,16,0,0q�$	��Top=�$	��177��$
��Bold"�$��Normal$�$��Maiandra GD)�$��14(��� -   $��keyWordsTextLabel��$��	Key words��$��28��$
��Left=�$��6,68,0,0q�$	��Top=�$	��146���� -   $��termTextBox��$��23��$
��Left=�$��
175,68,0,0q�$	��Top=�$	��271������ *Term+ � DataContext �� �� -   $��searchButton��$��Button��$��23��$
��Left=�$��371,109,0,0q�$	��Top=�$��75������ *SearchTravelsCommand+�� -   $��travelsLabel��$��Results��$��28��$
��Left=�$��	6,142,0,0q�$	��Top=�$	��146���� -   $��travelsListView��$	��125��$
��Left=�$��	6,176,0,0q�$	��Top=�$	��440������ *	Travels+ �� View �� .P��� $
��Name�� �� Width$	 129��	 �� DisplayMemberBinding	 �� 
 �� Path$

 Name��� -   $��hasVisitedTabItem��$�� ��$��0��$��0��.��� -   $��hasVisitedGrid��$	��347��$	��487��{�.  Z� .+��� -   $��hasVisitedLabel��$��Query visits of users��$��28��$
��Left=�$��6,16,0,0q�$	��Top=�$	��455��$
��Bold"�$��Normal$�$��Maiandra GD)�$��14(��� -   $��usernameLabel��$��
Username :��$��28��$
��Left=�$��6,68,0,0q�$	��Top=�$	��136���� -   $��usernameTextBox��$��23��$
��Left=�$��
173,70,0,0q�$	��Top=�$	��265������ *
Username+�� -   $��label2��$��Destination :��$��28��$
��Left=�$��	6,102,0,0q�$	��Top=��� -   $��destinationTextBox��$��23��$
��Left=�$��173,104,0,0q�$	��Top=�$	��265������ *Destination+�� -   $��
yesNoImage��$	��141��$
��Left=�$��173,188,0,0q�$
��Fill=�$	��Top=�$	��265��$2��,/EasytravelClient;component/Images/white.jpg���� -   $��button1��$��Check��$��23��$
��Left=�$��363,145,0,0q�$	��Top=�$��75������ *CheckHasVisitedCommand+�� -   $��mostVisitedTabItem��$�� ��$��0��$��0��.��� -   $��mostVisitedGrid��$	��347��$	��487��{�.  Z� .+��� -   $��mostVisitedTitle��$��Query most visited places��$��28��$
��Left=�$��6,16,0,0q�$	��Top=�$	��450��$
��Bold"�$��Normal$�$��Maiandra GD)�$��14(��� -    $��mostVisitedLabel��$'��!The most visited destination is :��$��28��$
��Left=�$��6,50,0,0q�$	��Top=�$	��178���� -!   $&�� mostVisitedDesstinationTextBlock��$��23��$
��Left=�$��
221,52,0,0q�$	��Top=�$	��120���� -"   $��label1��$(��"The most visited destination has :��$��28��$
��Left=�$��6,84,0,0q�$	��Top=�$	��194���� -#   $-��'mostVisitedDesstinationNumbersTextBlock��$��23��$
��Left=�$��
221,84,0,0q�$	��Top=�$��72���� -$   $��label3��$��travels.��$��28��$
��Left=�$��
299,84,0,0q�$	��Top=�$	��101���� -%   $��tenMostVisitedLabel��$'��!The ten most popular destinations��$��28��$
��Left=�$��	6,140,0,0q�$	��Top=�$	��194���� -&   $ ��mostPopDestinationListView��$	��127��$
��Left=�$��
14,174,0,0q�$	��Top=�$	��430������ *MostVisitedDestinations+ �� .P��� $
��Name��$	 129��	 �� $

 Name��� -'   $��button2��$��Refresh��$��23��$
��Left=�$��369,307,0,0q�$	��Top=�$��75������ *RefreshMostVisitedCommand+